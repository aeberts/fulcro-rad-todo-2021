(ns com.alexeberts.todo-frt.components.delete-middleware
  (:require
    [com.fulcrologic.rad.database-adapters.datomic :as datomic]))

(def middleware (datomic/wrap-datomic-delete))
