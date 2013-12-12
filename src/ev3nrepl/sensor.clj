(ns ev3nrepl.sensor
  (:import lejos.hardware.port.SensorPort
           (lejos.hardware.sensor EV3ColorSensor
                                  EV3GyroSensor
                                  EV3IRSensor
                                  EV3TouchSensor
                                  EV3UltrasonicSensor)))

(def s1 (atom nil))
(def s2 (atom nil))
(def s3 (atom nil))
(def s4 (atom nil))

(defn resolve-port [port]
  (eval (symbol (str "SensorPort/S" port))))

(defn init-color [port]
  (EV3ColorSensor. (resolve-port port)))

(defn init-gyro [port]
  (EV3GyroSensor. (resolve-port port)))

(defn init-ir [port]
  (EV3IRSensor. (resolve-port port)))

(defn init-touch [port]
  (EV3TouchSensor. (resolve-port port)))

(defn init-ultrasonic [port]
  (EV3UltrasonicSensor. (resolve-port port)))

(defn get-distance [ultra]
  (let [arr (float-array 1)
        sp (.getDistanceMode ultra)]
    (.fetchSample sp arr 0)
    (aget arr 0)))
