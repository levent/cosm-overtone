(ns cosm-overtone.core
  (:require [clj-http.client :as client]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main
  "Called by lein run"
  [& args]
  (foo "Overtone"))
