# This is the newer version

FROM node:18-alpine

WORKDIR /appdoc

COPY package.json .

# Improve this by copying the build dir to docker and don't run npm install

RUN npm install

RUN npm i -g serve

COPY . .

RUN npm run build

EXPOSE 3000

CMD [ "serve", "-s", "dist" ]