'use strict';

angular.module('RootController', [])
	.controller('RootController', function($scope, $http, ENV) {
		$scope.login = function() {
			var FIELDS = {
				vCode: $('#vCode'),
				apiKey: $('#apiKey')
			};

			var authData = {
				'vCode': FIELDS.vCode.val(),
				'apiKey': FIELDS.apiKey.val()
			};

			$http.get(ENV.apiEndpoint).success(function(data, status, headers, config) {
				$scope.message = data.message;
			}).error(function(data, status, headers, config) {
				$scope.errors = [];
				for(item in data) {
					$scope.errors.push(status + ' - ' + data[item]);
				}
			});
		}
	});
