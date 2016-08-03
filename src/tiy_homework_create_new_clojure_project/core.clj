(ns tiy-homework-create-new-clojure-project.core)

(defn -main []
  ;Create the bindings that include string and integers
  (def guy "Jim")
  (def age 22)
  (def duck "Wood Ducks")
  (def master-year 20)
  (def num-var 42)
  (def num-got 3)
  (def truck "Ford Ranger")
  (def miles-to-go 90304.5)
  (def hope true)

  (println "This is" guy)
  (println guy "is" age)
  (println guy "likes to hunt" duck)
  (println "By the time you are" (+ age master-year) "you will have shot all varieties")
  (println "From the time you start hunting the timeline for greatness is" master-year)
  (println "Don't worry you are only" age)
  (println "I have only" num-got "right now")
  (println "Need to get all" num-var "of them")
  (println "We have to get" (- num-var num-got) "more to complete." )
  (println "Will have to rely on my" truck "to get me around, this is" hope)
  (println "My" truck "will have to last" miles-to-go "miles of travel. Hope it holds up!")

  )
(-main)


