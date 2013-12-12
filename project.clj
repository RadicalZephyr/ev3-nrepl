(defproject ev3nrepl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :uberjar-name "ev3nrepl.jar"
  :main ev3nrepl.core
  :aliases {"run-ev3" ["do" "uberjar,"
                       "shell" "scp" "target/ev3nrepl.jar" "root@10.0.1.1:,"
                       "shell" "ssh" "-f" "root@10.0.1.1" "/bin/jrun -jar /home/root/ev3nrepl.jar"]
            "shutdown-ev3" ["shell" "ssh" "root@10.0.1.1" "halt"]}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.nrepl "0.2.3"]
                 [org.clojars.earthlingzephyr/lejos-ev3 "0.5.0-SNAPSHOT"]]
  :plugins [[lein-shell "0.3.0"]])
