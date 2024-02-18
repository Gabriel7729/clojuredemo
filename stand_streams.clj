(defn cljdemo []
  (println "Printing Standard Output")
  (println "Printing Standard Error" > *err*))
    (cljdemo)

    (doseq [ln (line-seq (java.io.BufferedReader. *in*))]
   (println ln))