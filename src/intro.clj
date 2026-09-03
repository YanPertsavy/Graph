(ns intro
  (:require [utils :refer [???]]))

(defn square [x]
  (* x x))

(defn sum-of-squares [x y]
  (+ (* x x) (* y y)))

(defn factorial [n]
  (loop [product 1, k 1]
    (if (> k n)
      product
      (recur (* k product) (inc k)))))

(defn gcd [a b]
  (if (= b 0)
    a
    (recur b (rem a b))))
