DESCRIPTION = "ros-world package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    packagegroup-ros-comm \
    actionlib \
    chatter-msgs \
    chatter-receiver \
    chatter-sender \
    actionlib-msgs \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    shape-msgs \
    stereo-msgs \
    angles \
    image-transport \
    roscpp-tutorials \
    rospy-tutorials \
    camera-calibration-parsers \
    camera-info-manager \
    camera-calibration \
    image-proc \
    stereo-image-proc \
    random-numbers \
    rosserial-arduino \
    rosserial-msgs \
    rosserial-python \
    plen-ros \
    plen-msgs \
    "

# ar-track-alvar does not compile due to unknown opencv identifiers.
# image-view requires gtk+, but it cannot be found by cmake for some reason.
# sound-play requires python-gst (which is not available in any layers' master branch)
# joint-state-publisher still has some issues.
# freenect-camera and freenect-launch requires opengl distro feature.
