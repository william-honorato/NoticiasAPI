var feeds = [];

angular.module('feedModule', ['ngResource'])
	.factory('FeedLoader', function ($resource) {
		return $resource('https://lingohub.com/blog/feed/json', {}, {
			fetch: { method: 'JSONP',cache: true, params: {v: '1.0', callback: 'JSON_CALLBACK'} }
		});
	})
	.service('FeedList', function ($rootScope, FeedLoader) {
		this.get = function () {
			
			if (feeds.length === 0) {
				for (var i = 0; i < feedSources.length; i++) {
					FeedLoader.fetch({ q: feedSources[i].url }, {}, function (data) {
						var feed = data.responseData.feed;
						feeds.push(feed);
					});
				}
			}
			return feeds;
		};
	})
	.controller('FeedCtrl', function ($scope, FeedList) {
		$scope.feeds = FeedList.get();
		$scope.$on('FeedList', function (event, data) {
			$scope.feeds = data;
			console.log("data",$scope.feeds);
		});
	});