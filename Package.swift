// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/psh/KmmWiggles/wiggles/spikeysanju/dev/shared-kmmbridge/1.0.1/shared-kmmbridge-1.0.1.zip"
let remoteKotlinChecksum = "fc9a76f0c0d44acb4fb915a39df422fe9e7e97d13cfcf93dba9e9ee828b40f2a"
let packageName = "SharedPuppyDB"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)