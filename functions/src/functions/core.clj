(ns functions.core
  (:gen-class))

;; Ex 1
;; Write a predicate NOT-ONEP that return T if its input is anything other than one
(defun not-onep (n)
   (not (equal n 1)))

;; Clojure conversion
(defn not-one?
  [n]
  (not (= n 1)))


;; Ex 2
;; Write the predicate NOT-PLUSP that returns T if its input is not greater than zero
(defun not-plusp (n)
  (not (> n 0)))

;; Clojure conversion
(defn not-plus?
  [n]
  (not (> n 0)))

;; Ex 3
;; Some earlier Lisp dialects did not have the EVENP primitive; they only had ODDP. Show how to define EVENP in terms of ODDP.
(defun my-evenp (n)
  (not (oddp n)))

;; Clojure conversion. 
(def my-evenp #(even? %)) 

;; Ex 4
;; Write XOR, the exclusive-or truth function.
(defun xor (n m)
  (not (eq (not n) (not m))))

;; Clojure conversion
(defn my-xor
  [a b]
  (not
   (= a b)))
