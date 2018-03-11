# SUNFISH UC-3 ROCU portal

## Requirements

* Sharemind JavaScript client library with SOAP adapter (sharemind-web-client >=0.2.0)

## Usage

Generate RSA keypair for web service:

```
openssl genrsa -out private.key 4096
openssl rsa -in private.key -pubout -out public.key
```

Install dependencies with `npm install`.

Run with

```
node service.js <rocu conf>
```
The demo ROCU configuration files are in `../demo`.

The database is generated on first run, but there are no users. Add demo users with `../demo/database*.js` scripts.