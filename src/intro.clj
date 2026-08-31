(ns intro
  (:require [utils :refer [???]]))

(defn square [x]
  (???))

(defn sum-of-squares [x y]
  (???))

(defn factorial [n]
  (loop [product 1, k 1]
    (if (> k n)
      (???)
      (recur (???) (???)))))

(defn gcd [a b]
  (if (= b 0)
    (???)
    (recur (???) (???))))
