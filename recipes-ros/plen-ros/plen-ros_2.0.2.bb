ESCRIPTION = "plen_ros"
SECTION = "devel" 
LICENSE = "BSD GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;;beginline=9;endline=10;md5=576551bf1327f14a5bdcf2ac7a7ca1fd"
DEPENDS = "roscpp catkin rospy std-msgs geometry-msgs sensor-msgs plen-msgs"
RDEPENDS_${PN} = "roscpp rospy std-msgs bluez5 mjpg-streamer python-pyserial geometry-msgs sensor-msgs plen-msgs"

SRC_URI = "https://github.com/plenprojectcompany/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ae44a814ed0857005bb242a352c78440"
SRC_URI[sha256sum] = "b6f579e785b04d49e5fde0f677d7690e28ade22039944b64322dbe4d9c188b11"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
