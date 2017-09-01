(ns com.tmountain.seq-peek-test
  (:require [clojure.test :refer :all]
            [com.tmountain.seq-peek :refer :all]))

(def iters (atom 0))
(def results (atom []))

(defn track-results
  [iter data]
  (do (swap! iters inc)
      (swap! results conj data)))

(deftest core-test
  (let [xs (range 10)
        result (doall (map #(* 2 %) (seq-peek 1 track-results xs)))]
    (is (= @results [0 1 2 3 4 5 6 7 8 9]))
    (is (= @iters 10))
    (is (= result [0 2 4 6 8 10 12 14 16 18]))
    (reset! iters 0)
    (reset! results [])
    (doall (map #(* 2 %) (seq-peek 5 track-results xs)))
    (is (= @iters 2))
    (is (= @results [4 9]))))
