// const Migrations = artifacts.require("Migrations");
// const GameItem = artifacts.require("GameItem");
// const MyNFTs = artifacts.require("MyNFTs")
// const TransNFTs = artifacts.require("TransNFTs")
// const test = artifacts.require("test")
// const TestNft = artifacts.require("TestNft")
const uritest = artifacts.require("uritest")
module.exports = function (deployer) {
  deployer.deploy(uritest);
  // deployer.deploy(TestNft);
  // deployer.deploy(GameItem)
  // deployer.deploy(MyNFTs)
  // deployer.deploy(TransNFTs,"name","symbol")
  // deployer.deploy(test,"j","b")
};
