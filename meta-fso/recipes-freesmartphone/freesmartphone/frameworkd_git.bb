require ${BPN}.inc

DEFAULT_PREFERENCE = "-1"

SRCREV = "7867e63de20cf6fb8d62fae8ab56eb50aa2bebf8"

SRC_URI = "${FREESMARTPHONE_GIT}/framework.git;protocol=git;branch=master \
           file://oeventsd-use-opimd-signals.patch \
           file://0001-oeventsd-workaround-buggy-kernel-to-get-full-vibrati.patch \
           file://${PN}.service \
"

S = "${WORKDIR}/git"
