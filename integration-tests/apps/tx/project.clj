(defproject tx "1.0.0-SNAPSHOT"
  :description "Tests in-container transactional stuff"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojars.jcrossley3/korma "1.0.0-SNAPSHOT"]
                 [lobos "1.0.0-SNAPSHOT"]
                 [com.h2database/h2 "1.3.160"]
                 [org.clojars.gukjoon/ojdbc "1.4"]
                 [mysql/mysql-connector-java "5.1.22"]
                 [postgresql "9.0-801.jdbc4"]
                 [net.sourceforge.jtds/jtds "1.2.4"]]
  :immutant {:swank-port 4111})