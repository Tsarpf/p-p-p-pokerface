(defproject p-p-p-pokerface "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [midje-grader "0.1.0-SNAPSHOT"]]
  :profiles {:dev
             {:dependencies [[midje "1.5.1"]]
              :plugins [[lein-midje "3.0.0"]]}})
