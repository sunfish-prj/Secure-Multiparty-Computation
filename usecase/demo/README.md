Clear old documents from the index with `del-documents` SecreC program.

The `add-owners` SecreC program adds two ROCU-s with their encryption keys to the index. This is only needed once after a fresh installation.

The `database*.js` files generate demo users for ROCU web interfaces.

Two ROCU configurations for `client-server` are in `serocu.conf` and `rocu2.conf`. Either change the `hosts` to the gateway hosts' SOAP endpoints in your deployment. If you use Unified eXchange Platform (UXP) (`useuxp = true`), configure `uxpclient` and `uxpservice` instead.

The _Anonymous ROCU_ logo is `rocu2-logo.png`, copy it over `client-server/public/img/serocu-logo.png`.