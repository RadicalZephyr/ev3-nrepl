(ns ev3nrepl.core
  (:gen-class)
  (:use [clojure.tools.nrepl.server :only (start-server stop-server)]))

(def server (atom nil))

(defn -main
  "I don't do a whole lot."
  [& args]
  (compare-and-set! server @server (start-server :port 19324))
  (prn-str "nRepl server started: " server))
