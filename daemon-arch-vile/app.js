const Koa = require("koa");
const logger = require("koa-logger");
const dotenv = require("dotenv");

const indexRoutes = require("./lib/routes/index");
const log = require("./lib/utils/logger");

dotenv.config({ silent: true });

const app = new Koa();
const { HOST, PORT } = process.env;

app.use(logger());
app.use(indexRoutes.routes());

const server = app.listen(PORT, HOST, () => {
  log.info(`server listening on ${HOST}:${PORT}`);
});

module.exports = server;
