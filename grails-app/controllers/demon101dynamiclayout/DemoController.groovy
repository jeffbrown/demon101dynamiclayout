package demon101dynamiclayout

class DemoController {

    def index() {
    }

    def plain() {
        render view: 'index', model: [dynamicLayout: 'plain']
    }
}
