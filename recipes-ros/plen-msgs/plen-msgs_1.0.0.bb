ESCRIPTION = "plen messages"
SECTION = "devel" 
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"
DEPENDS = "message-generation message-runtime std-msgs"
RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/plenprojectcompany/plen_msgs/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3f803363a7c5a073d7e6f69623ba69c6"
SRC_URI[sha256sum] = "4ecc89a93e479767ce378a68f4cbb7311daf775e1154cf7d2c04df4a91b7cd84"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
