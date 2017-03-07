ESCRIPTION = "plen_ros"
SECTION = "devel" 
LICENSE = "BSD GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;;beginline=9;endline=10;md5=576551bf1327f14a5bdcf2ac7a7ca1fd"
DEPENDS = "roscpp catkin rospy std-msgs geometry-msgs sensor-msgs plen-msgs"
RDEPENDS_${PN} = "roscpp rospy std-msgs bluez5 mjpg-streamer python-pyserial geometry-msgs sensor-msgs plen-msgs"

SRC_URI = "https://github.com/plenprojectcompany/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b1d7b52ba0e3a47c6c7bc8b2292b755e"
SRC_URI[sha256sum] = "7a21a62e14e807082236b2a5937e3f98d165d128a7b9378f47029b67b1659c04"


S = "${WORKDIR}/${ROS_SP}"

inherit catkin
