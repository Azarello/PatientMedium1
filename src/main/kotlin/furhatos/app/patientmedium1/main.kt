package furhatos.app.patientmedium1

import furhatos.app.patientmedium1.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class Patientmedium1Skill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
