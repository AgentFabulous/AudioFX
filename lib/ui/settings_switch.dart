import 'package:flutter/material.dart';

class SettingsSwitch extends StatelessWidget {
  final bool enabled;
  final Function setValue;
  final bool value;
  final Color activeColor;

  SettingsSwitch({
    this.enabled = true,
    @required this.setValue,
    @required this.value,
    this.activeColor,
  })  : assert(setValue != null),
        assert(value != null);

  @override
  Widget build(BuildContext context) {
    final activeColor = this.activeColor ?? Theme.of(context).accentColor;
    return Switch(
      activeColor: activeColor,
      value: value,
      onChanged: enabled ? (b) => setValue(b) : null,
    );
  }
}
