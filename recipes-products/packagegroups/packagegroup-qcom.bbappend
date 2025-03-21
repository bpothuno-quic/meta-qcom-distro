
PACKAGES += " \
    ${PN}-filesystem-utils \
    ${PN}-support-utils \
    "

RDEPENDS:${PN}-support-utils = " \
    libinput \
    libinput-bin \
    libnl \
    libxml2 \
    procps \
    "

RDEPENDS:${PN}-filesystem-utils = " \
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-resize2fs \
    e2fsprogs-tune2fs \
    "
