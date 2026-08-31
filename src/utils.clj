(ns utils)

(defn ??? [] (throw (AssertionError. "Not implemented")))

(defn pairs [items]
  (loop [result    []
         remaining items]
    (if (empty? remaining)
      result
      (let [a  (first remaining)
            bs (rest remaining)]
        (recur (into result (map (fn [b] [a b]) bs))
               bs)))))

(defn consecutive-pairs [items]
  (partition 2 1 items))

(defn subsequence? [a b]
  (loop [a a, b b]
    (cond (empty? a) (???)
          (empty? b) (???)
          (= (first a) (first b)) (recur (???) (???))
          :else (recur (???) (???)))))

(defn all-distinct? [items]
  (or (empty? items)
      (apply distinct? items)))
