(ns turksort.core)

(import '(java.text Collator))
(import '(java.util Locale))

(defn -main
  "Do nothing."
  [& args]
  (println
   (sort (fn [x y]
           (def c (Collator/getInstance (Locale/forLanguageTag
                                          "tr-TR")))
           (.setStrength c Collator/TERTIARY)
           (.compare c x y))
         '("Ali", "Veli", "Çetin", "Deniz", "Ömer", "Cengiz"))))
