EXTRA_OECMAKE += " -DREDIS_PLUS_PLUS_CXX_STANDARD=17 -DCMAKE_INSTALL_PREFIX=${exec_prefix} -DREDIS_PLUS_PLUS_BUILD_SHARED=OFF"
FILES_${PN} = "${exec_prefix}/lib/*"
FILES_${PN}-dev = "${exec_prefix}/lib/* ${exec_prefix}/include/*"
