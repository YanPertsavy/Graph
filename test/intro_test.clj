(ns intro-test
  (:require [clojure.test :refer :all])
  (:use intro))

(deftest square-test
  (is (= 4 (square 2)))
  (is (= 9 (square -3))))

(deftest sum-of-squares-test
  (is (= 25 (sum-of-squares 3 4))))

(deftest factorial-test
  (is (= 1 (factorial 1)))
  (is (= 2 (factorial 2)))
  (is (= 6 (factorial 3)))
  (is (= 24 (factorial 4))))

(deftest gcd-test
  (is (= 4 (gcd 16 28))))
