DESCRIPTION = "Sówka e-wm theme"
SECTION = "e/utils"
DEPENDS = "edje-native"
LICENSE = "MIT & BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f523ab5986cc79b52a90d2ac3d5454a2"
SRCREV = "d488ccabe2a21c08f9cde79e674c75faa26dcab3"
PV = "0.2+gitr${SRCPV}"
inherit allarch

SRC_URI = "git://git.shr-project.org/repo/shr-themes.git;protocol=http;branch=master"

S = "${WORKDIR}/git/e-wm/${PN}"

do_compile() {
    ${STAGING_BINDIR_NATIVE}/edje_cc -id ${S}/images/. -fd ${S}/fonts/. ${S}/sowka.edc -o ${S}/sowka.edj
}

do_install() {
    install -d ${D}${datadir}/enlightenment/data/themes/
    install -m 0644 ${S}/sowka.edj ${D}${datadir}/enlightenment/data/themes/
}

FILES_${PN} = "${datadir}/enlightenment/data/themes/sowka.edj"


