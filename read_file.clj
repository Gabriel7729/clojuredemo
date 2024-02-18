(ns clojure.examples.hello
   (:gen-class))

;; This program displays Hello World
(defn Example []
   (def string1 (slurp "assets/Example.txt"))
   (println string1))
(Example)