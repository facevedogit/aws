var app = angular.module("app", []);

app.controller("SeguroController",['$scope','$log','$http',function($scope,$log,$http) {
	$scope.seguro = {
		rif : "",
		nombre : "",
		apellido : "",
		edad : undefined,
		sexo : "",
		casado : false,
		numHijos : undefined,
		embarazada : false,
		cobertura : {
			oftalmologia : false,
			dental : false,
			fecundacionInVitro : false
		},
		enfermedad : {
			corazon : false,
			estomacal : false,
			rinyones : false,
			alergia : false,
			nombreAlergia : ""
		},
		fechaCreacion : new Date()
	}

	$log.debug("Acabamos de crear el $scope");
	$http({
		method : 'GET',
		url : 'http://localhost:8085/seguromedico/api/SeguroMedico/1'
	}).success(function(data, status, headers, config) {
		$scope.seguro = data;
		$log.debug("Acabamos de crear el " + $scope.seguro + " S: " + status + " H: " + headers + " C: " + config);
	}).error(function(data, status, headers, config) {
		alert("Ha fallado la petición. Estado HTTP:" + status);
	});
} ]);