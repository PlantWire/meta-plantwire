COMPATIBLE_MACHINE = "(nanopi-neo|orange-pi-zero)"

FILESEXTRAPATHS:prepend := "${THISDIR}/patchs:"

# Enables UART1 and UART2
# See https://github.com/linux-sunxi/meta-sunxi/issues/288
SRC_URI += "file://0001-uart1-uart2-usb1-usb2-dts-patch.patch \
       "
