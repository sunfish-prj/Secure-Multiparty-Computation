# SUNFISH UC-3 Gateway Application

## Requirements

* Sharemind Academic or Application Server v2017.12
* Sharemind Web Application Gateway with SOAP adapter >= 0.2.0
	* This brings the necessary `sharemind-gateway-soap-service.js` and `sharemind-soap.wsdl` files.

## Usage

Change the `serverNames` values in `gateway.js` to match the Sharemind server names in your deployment.

Run with

```
node gateway.js gatewayNumber [port] [hostname] [confFile]
```
where `gatewayNumber = {1,2,3}` and `confFile` is Sharemind Web Application Gateway configuration file.