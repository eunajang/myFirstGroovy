package com.animal

class HomeController {

    def index() {
        respond([
            name: session.name ?: 'Name',
            petList: Pet.list(),
            petTotal: Pet.count()
        ])
    }

    def updateName(String name) {
        session.name = name
        flash.message = "Name has been updated"
        redirect action: 'index'
    }
}
