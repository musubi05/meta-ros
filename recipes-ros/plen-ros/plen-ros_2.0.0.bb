ESCRIPTION = "plen_ros"
SECTION = "devel" 
LICENSE = "BSD GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;;beginline=9;endline=10;md5=576551bf1327f14a5bdcf2ac7a7ca1fd"
DEPENDS = "roscpp catkin rospy std-msgs geometry-msgs sensor-msgs plen-msgs"
RDEPENDS_${PN} = "roscpp rospy std-msgs bluez5 mjpg-streamer python-pyserial geometry-msgs sensor-msgs plen-msgs"

SRC_URI = "https://github.com/plenprojectcompany/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e3a91e92be864b1bdc4f0b982c8029eb"
SRC_URI[sha256sum] = "f0a0f014210af966035eda7efb1d107704b053206c11b4e8bdc304137c59eccb"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
