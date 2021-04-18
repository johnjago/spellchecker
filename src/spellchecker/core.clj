(ns spellchecker.core
  (:require [clojure.string :as str]))

(def words
  (set (map
         str/trim
         (str/split-lines (slurp "resources/en.txt")))))

(defn correct?
  [word]
  (contains? words word))
