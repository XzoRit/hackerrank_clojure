(ns hackerrank.core
  (:gen-class))

(defn -main
  "typical hello world"
  [& _]
  (println "Hello, World!"))

(defn list-replication [num lst]
    (->>
        (map #(repeat num %) lst)
        (flatten)))

(defn filter-array [delim lst]
    (for [x lst :when (< x delim)] x))

(defn filter-position [lst]
    (for [a (range (count lst)) :when (odd? a)]
        (nth lst a)))

(defn array-of-n-elements [n]
    (range n))
