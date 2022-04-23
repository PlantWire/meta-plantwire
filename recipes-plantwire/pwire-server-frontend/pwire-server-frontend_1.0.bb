#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "The server backend for the pwire project "
SECTION = "pwire"
RDEPENDS_${PN} = "php"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7bbe9936270b740a92fd3e8b44c435f"

SRCREV = "1736c6541273be42364c503b7a0ca390c3740534"
SRC_URI = "gitsm://github.com/PlantWire/server.git"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

FILES_${PN} = "${bindir}/*"
FILES_${PN}-dev = "${bindir}/* ${libdir}/* ${includedir}/*"
