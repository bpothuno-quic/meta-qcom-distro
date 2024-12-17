SUMMARY = "Qualcomm multimedia packagegroups"
DESCRIPTION = "Package groups to bring in packages required to enable multimedia support"

LICENSE = "BSD-3-Clause-Clear"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "${PN}"

RDEPENDS:${PN} = "\
    packagegroup-container \
    packagegroup-qcom-k8s \
    packagegroup-qcom-opencv \
    python3-docker-compose \
    packagegroup-qcom-display \
    "

RDEPENDS:${PN}:append:qcom-custom-distro = "\
    packagegroup-qcom-audio \
    packagegroup-qcom-camera \
    packagegroup-qcom-display \
    packagegroup-qcom-fastcv \
    packagegroup-qcom-graphics \
    packagegroup-qcom-iot-base-utils \
    packagegroup-qcom-video \
    "
