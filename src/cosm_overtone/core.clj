(ns cosm-overtone.core
  (:use overtone.live)
  (:require [clj-http.client :as client]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main
  "Called by lein run"
  [& args]
  (osc-listen (osc-server 44100 "osc-clj") (fn [msg] (foo msg)) :debug))
