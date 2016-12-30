var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/home',{
            templateUrl: 'home.html',
            controller: 'homeController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

