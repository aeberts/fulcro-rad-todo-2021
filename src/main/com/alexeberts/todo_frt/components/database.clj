(ns com.alexeberts.todo-frt.components.database
  (:require
    [com.fulcrologic.rad.database-adapters.datomic :as datomic]
    [mount.core :refer [defstate]]
    [com.alexeberts.todo-frt.model-rad.attributes :refer [all-attributes]]
    [com.alexeberts.todo-frt.components.config :refer [config]]))

(defstate ^{:on-reload :noop} datomic-connections
  :start
  (datomic/start-databases all-attributes config))
