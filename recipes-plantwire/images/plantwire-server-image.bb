require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "A small image just capable of allowing a device to boot and \
having a calculator"

# Add package (not recipe) to image
# could also have used IMAGE_INSTALL_append = " bc" -> space at beginning
IMAGE_INSTALL += "redis"
#IMAGE_INSTALL_remove =+ "bc"
# Due to package splitting both have to be installed in order for ask to
# be available
#IMAGE_INSTALL =+ "libanswer libanswer-example"

# Other thing is IMAGE_FEATURES += "" -> adds packagegroup (settings etc.)
#IMAGE_FEATURES += "ssh-server-dropbear"
