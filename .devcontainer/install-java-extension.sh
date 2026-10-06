#!/usr/bin/env bash
set -eu

extension_id="vscjava.vscode-java-pack"

if ! code --list-extensions | grep -Fxq "$extension_id"; then
    code --install-extension "$extension_id"
fi