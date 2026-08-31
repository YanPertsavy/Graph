(ns utils-test
  (:require [clojure.test :refer [deftest is]])
  (:use [utils]))

(deftest ???-test
  (is (thrown? AssertionError (???))))

(deftest pairs-test
  (is (= [] (pairs [])))
  (is (= [] (pairs [1])))
  (is (= [[1 2]] (pairs [1 2])))
  (is (= [[1 2] [1 3] [2 3]] (pairs [1 2 3])))
  (is (= [[1 2] [1 3] [1 4] [2 3] [2 4] [3 4]] (pairs [1 2 3 4]))))

(deftest consecutive-pairs-test
  (is (= [] (consecutive-pairs [])))
  (is (= [] (consecutive-pairs [1])))
  (is (= [[1 2]] (consecutive-pairs [1 2])))
  (is (= [[1 2] [2 3] [3 4]] (consecutive-pairs [1 2 3 4])))
  (is (= [[5 5] [5 5]] (consecutive-pairs [5 5 5]))))

(deftest subsequence?-test
  (is (subsequence? [] [1 2 3]))
  (is (subsequence? [1] [1 2 3]))
  (is (subsequence? [1 3] [1 2 3]))
  (is (subsequence? [1 2 3] [1 2 3]))
  (is (subsequence? [2 4] [1 2 3 4 5]))
  (is (subsequence? [3 3 3] [3 3 3 3]))
  (is (not (subsequence? [5 6] [1 2 3])))
  (is (not (subsequence? [5 5 5] [5 5])))
  (is (not (subsequence? [3 2 1] [1 2 3]))))

(deftest all-distinct?-test
  (is (all-distinct? []))
  (is (all-distinct? [1 2 3]))
  (is (not (all-distinct? [1 2 2 3])))
  (is (not (all-distinct? [1 2 3 1]))))
