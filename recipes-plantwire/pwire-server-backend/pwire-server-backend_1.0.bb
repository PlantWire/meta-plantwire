#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "The server backend for the pwire project "
SECTION          =  "pwire"
DEPENDS          +=  "boost redis-plus-plus"
RDEPENDS:${PN}   += "redis"
LICENSE          =  "MIT"
LIC_FILES_CHKSUM =  "file://LICENSE;md5=d7bbe9936270b740a92fd3e8b44c435f"

SRCREV = "bb4804f33c5865ee4e1821118e6b62b33be33817"
SRC_URI = "gitsm://github.com/PlantWire/server.git"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
OECMAKE_TARGET_COMPILE="pWireServerExecutable"


#FILES:${PN} = "${bindir}/* ${sbindir}/* ${libexecdir}/* ${libdir}/*"
#FILES_${PN}-dev = "${bindir}/* ${sbindir}/* ${libexecdir}/* ${libdir}/* ${includedir}/*"

#FILES:${PN}-bin = "${bindir}/* ${sbindir}/*"
#FILES:${PN}-lib = "${libdir}/libpWireServer.a"

RM_EXCLUDE = "pwire-server-backend"
