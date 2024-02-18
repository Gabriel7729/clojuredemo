(ns clojure.examples.hello
   (:gen-class))

;; This program displays Hello World
(defn Example []
   (def string1 (slurp "http://example.com"))
   (println string1))
(Example)