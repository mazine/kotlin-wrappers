// Automatically generated - do not modify!

package react.dom

import org.w3c.dom.Element

external interface InputHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var accept: String
    var alt: String
    var autoComplete: String
    var autoFocus: Boolean
    var capture: Boolean // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
    var checked: Boolean
    var crossOrigin: String
    var disabled: Boolean
    var enterKeyHint: EnterKeyHint
    var form: String
    var formAction: String
    var formEncType: String
    var formMethod: String
    var formNoValidate: Boolean
    var formTarget: String
    var height: Double
    var list: String
    var max: Double
    var maxLength: Int
    var min: Double
    var minLength: Int
    var multiple: Boolean
    var name: String
    var pattern: String
    override var placeholder: String
    var readOnly: Boolean
    var required: Boolean
    var size: Int
    var src: String
    var step: Double
    var type: InputType
    var value: String
    var width: Double

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var onChange: ChangeEventHandler<T>
}
