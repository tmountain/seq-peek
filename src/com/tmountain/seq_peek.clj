(ns com.tmountain.seq-peek)

(defn seq-peek
  "Calls callback after n entries in s are evaluated."
  [n callback s]
  (let [call-and-return
       (fn [iter data]
         (do (if (zero? (rem iter n))
               (callback iter data))
             data))]
    (map call-and-return
         (iterate inc 1) s)))
